/*
 * Copyright 2011 John Ahlroos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fi.jasoft.dragdroplayouts.client.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.gwt.user.client.ui.Widget;
import com.vaadin.terminal.gwt.client.ApplicationConnection;
import com.vaadin.terminal.gwt.client.Paintable;
import com.vaadin.terminal.gwt.client.UIDL;
import com.vaadin.terminal.gwt.client.ValueMap;

/**
 * A drag filter which uses PIDs to check the components draggability
 * @author John Ahlroos
 * @since 0.6.1
 */
public class VDragFilter {

    private final Map<Paintable, Boolean> dragmap = new HashMap<Paintable, Boolean>();
    
    public static final String DRAGMAP_ATTRIBUTE = "dragmap";
    
    /**
     * Update the drag map from an UIDL request
     * 
     * @param uidl
     * 		The UIDL 
     * 
     * @param client
     * 		The associated application connection
     */
    public void update(UIDL uidl, ApplicationConnection client){
    	dragmap.clear();
    	if(uidl.hasAttribute(DRAGMAP_ATTRIBUTE)){	
    		ValueMap vmap = uidl.getMapAttribute(DRAGMAP_ATTRIBUTE);
    		Set<String> pids = vmap.getKeySet();
    		for(String pid : pids){
    			Paintable p = client.getPaintable(pid);
    			boolean draggable = vmap.getBoolean(pid);
    			if(p != null){			
    				dragmap.put(p, draggable);
    			}
    		}
    	}
    }
    
    /**
     * Returns true if a widget is draggable
     * 
     * @param widget
     * 		The widget to check for
     * 
     * @return
     */
    public boolean isDraggable(Widget widget){
    	if(dragmap.containsKey(widget)){
    		return dragmap.get(widget);
    	}
    	return false;
    }
}
