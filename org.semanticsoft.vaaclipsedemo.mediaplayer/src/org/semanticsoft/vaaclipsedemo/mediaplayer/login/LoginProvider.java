/**
 * 
 */
package org.semanticsoft.vaaclipsedemo.mediaplayer.login;

import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.semanticsoft.vaaclipse.publicapi.authentication.AuthenticationConstants;
import org.semanticsoft.vaaclipse.publicapi.authentication.User;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.LoginForm.LoginEvent;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.LoginForm.LoginListener;
import com.vaadin.ui.Panel;

/**
 * @author rushan
 *
 */
public class LoginProvider
{
	@Inject
	IEventBroker eventBroker;
	
	@Inject
	public LoginProvider(VerticalLayout parent)
	{
		Panel loginPanel = new Panel("Login");
		loginPanel.setWidth("250px");
		parent.addComponent(loginPanel);
		
		parent.setComponentAlignment(loginPanel, Alignment.MIDDLE_CENTER);
		
		LoginForm login = new LoginForm();
		loginPanel.addComponent(login);
		
		login.addListener(new LoginListener() {
			
			@Override
			public void onLogin(LoginEvent event)
			{
				String username = event.getLoginParameter("username");
				//String password = event.getLoginParameter("password");
                
				if (username.trim().isEmpty())
					username = null;
				
				if (username == null)
					username = "guest";
                
				User user = new User(username);
				eventBroker.send(AuthenticationConstants.Events.Authentication, user);	
			}
		});
	};

}
