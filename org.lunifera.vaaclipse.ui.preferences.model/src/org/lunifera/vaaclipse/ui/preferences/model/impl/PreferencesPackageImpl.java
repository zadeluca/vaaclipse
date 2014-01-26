/**
 */
package org.lunifera.vaaclipse.ui.preferences.model.impl;

import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;

import org.eclipse.e4.ui.model.application.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lunifera.vaaclipse.ui.preferences.model.BooleanFieldEditor;
import org.lunifera.vaaclipse.ui.preferences.model.BooleanFieldStyle;
import org.lunifera.vaaclipse.ui.preferences.model.ComboFieldEditor;
import org.lunifera.vaaclipse.ui.preferences.model.DirectoryFieldEditor;
import org.lunifera.vaaclipse.ui.preferences.model.Entry;
import org.lunifera.vaaclipse.ui.preferences.model.FieldEditor;
import org.lunifera.vaaclipse.ui.preferences.model.FileFieldEditor;
import org.lunifera.vaaclipse.ui.preferences.model.IntegerFieldEditor;
import org.lunifera.vaaclipse.ui.preferences.model.ListEditor;
import org.lunifera.vaaclipse.ui.preferences.model.ListFieldEditor;
import org.lunifera.vaaclipse.ui.preferences.model.PreferencesCategory;
import org.lunifera.vaaclipse.ui.preferences.model.PreferencesPage;

import org.lunifera.vaaclipse.ui.preferences.model.RadioGroupFieldEditor;
import org.lunifera.vaaclipse.ui.preferences.model.ScaleFieldEditor;
import org.lunifera.vaaclipse.ui.preferences.model.StringFieldEditor;
import org.lunifera.vaaclipse.ui.preferences.model.metadata.PreferencesFactory;
import org.lunifera.vaaclipse.ui.preferences.model.metadata.PreferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreferencesPackageImpl extends EPackageImpl implements PreferencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferencesCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferencesPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanFieldEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listFieldEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboFieldEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioGroupFieldEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleFieldEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringFieldEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerFieldEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileFieldEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryFieldEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanFieldStyleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.vaaclipse.ui.preferences.model.metadata.PreferencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PreferencesPackageImpl() {
		super(eNS_URI, PreferencesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PreferencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PreferencesPackage init() {
		if (isInited) return (PreferencesPackage)EPackage.Registry.INSTANCE.getEPackage(PreferencesPackage.eNS_URI);

		// Obtain or create and register package
		PreferencesPackageImpl thePreferencesPackage = (PreferencesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PreferencesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PreferencesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApplicationPackageImpl.eINSTANCE.eClass();

		// Create package meta-data objects
		thePreferencesPackage.createPackageContents();

		// Initialize created meta-data
		thePreferencesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePreferencesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PreferencesPackage.eNS_URI, thePreferencesPackage);
		return thePreferencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreferencesCategory() {
		return preferencesCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreferencesCategory_Name() {
		return (EAttribute)preferencesCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreferencesCategory_ChildCategories() {
		return (EReference)preferencesCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreferencesCategory_ParentCategory() {
		return (EReference)preferencesCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreferencesCategory_Page() {
		return (EReference)preferencesCategoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreferencesPage() {
		return preferencesPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreferencesPage_Category() {
		return (EReference)preferencesPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreferencesPage_PreferencesScope() {
		return (EAttribute)preferencesPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldEditor() {
		return fieldEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldEditor_Label() {
		return (EAttribute)fieldEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldEditor_PreferenceName() {
		return (EAttribute)fieldEditorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanFieldEditor() {
		return booleanFieldEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanFieldEditor_Style() {
		return (EAttribute)booleanFieldEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListFieldEditor() {
		return listFieldEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListFieldEditor_Entries() {
		return (EReference)listFieldEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboFieldEditor() {
		return comboFieldEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListEditor() {
		return listEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioGroupFieldEditor() {
		return radioGroupFieldEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleFieldEditor() {
		return scaleFieldEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleFieldEditor_MinValue() {
		return (EAttribute)scaleFieldEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleFieldEditor_MaxValue() {
		return (EAttribute)scaleFieldEditorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleFieldEditor_IncrementValue() {
		return (EAttribute)scaleFieldEditorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringFieldEditor() {
		return stringFieldEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerFieldEditor() {
		return integerFieldEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerFieldEditor_MinValidValue() {
		return (EAttribute)integerFieldEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerFieldEditor_MaxValidValue() {
		return (EAttribute)integerFieldEditorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileFieldEditor() {
		return fileFieldEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectoryFieldEditor() {
		return directoryFieldEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Name() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Value() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanFieldStyle() {
		return booleanFieldStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferencesFactory getPreferencesFactory() {
		return (PreferencesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		preferencesCategoryEClass = createEClass(PREFERENCES_CATEGORY);
		createEAttribute(preferencesCategoryEClass, PREFERENCES_CATEGORY__NAME);
		createEReference(preferencesCategoryEClass, PREFERENCES_CATEGORY__CHILD_CATEGORIES);
		createEReference(preferencesCategoryEClass, PREFERENCES_CATEGORY__PARENT_CATEGORY);
		createEReference(preferencesCategoryEClass, PREFERENCES_CATEGORY__PAGE);

		preferencesPageEClass = createEClass(PREFERENCES_PAGE);
		createEReference(preferencesPageEClass, PREFERENCES_PAGE__CATEGORY);
		createEAttribute(preferencesPageEClass, PREFERENCES_PAGE__PREFERENCES_SCOPE);

		fieldEditorEClass = createEClass(FIELD_EDITOR);
		createEAttribute(fieldEditorEClass, FIELD_EDITOR__LABEL);
		createEAttribute(fieldEditorEClass, FIELD_EDITOR__PREFERENCE_NAME);

		booleanFieldEditorEClass = createEClass(BOOLEAN_FIELD_EDITOR);
		createEAttribute(booleanFieldEditorEClass, BOOLEAN_FIELD_EDITOR__STYLE);

		listFieldEditorEClass = createEClass(LIST_FIELD_EDITOR);
		createEReference(listFieldEditorEClass, LIST_FIELD_EDITOR__ENTRIES);

		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__NAME);
		createEAttribute(entryEClass, ENTRY__VALUE);

		comboFieldEditorEClass = createEClass(COMBO_FIELD_EDITOR);

		listEditorEClass = createEClass(LIST_EDITOR);

		radioGroupFieldEditorEClass = createEClass(RADIO_GROUP_FIELD_EDITOR);

		scaleFieldEditorEClass = createEClass(SCALE_FIELD_EDITOR);
		createEAttribute(scaleFieldEditorEClass, SCALE_FIELD_EDITOR__MIN_VALUE);
		createEAttribute(scaleFieldEditorEClass, SCALE_FIELD_EDITOR__MAX_VALUE);
		createEAttribute(scaleFieldEditorEClass, SCALE_FIELD_EDITOR__INCREMENT_VALUE);

		stringFieldEditorEClass = createEClass(STRING_FIELD_EDITOR);

		integerFieldEditorEClass = createEClass(INTEGER_FIELD_EDITOR);
		createEAttribute(integerFieldEditorEClass, INTEGER_FIELD_EDITOR__MIN_VALID_VALUE);
		createEAttribute(integerFieldEditorEClass, INTEGER_FIELD_EDITOR__MAX_VALID_VALUE);

		fileFieldEditorEClass = createEClass(FILE_FIELD_EDITOR);

		directoryFieldEditorEClass = createEClass(DIRECTORY_FIELD_EDITOR);

		// Create enums
		booleanFieldStyleEEnum = createEEnum(BOOLEAN_FIELD_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackageImpl.eNS_URI);
		UiPackageImpl theUiPackage = (UiPackageImpl)EPackage.Registry.INSTANCE.getEPackage(UiPackageImpl.eNS_URI);

		// Create type parameters
		addETypeParameter(fieldEditorEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		preferencesCategoryEClass.getESuperTypes().add(theApplicationPackage.getApplicationElement());
		EGenericType g1 = createEGenericType(theUiPackage.getElementContainer());
		EGenericType g2 = createEGenericType(this.getFieldEditor());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		preferencesPageEClass.getEGenericSuperTypes().add(g1);
		fieldEditorEClass.getESuperTypes().add(theUiPackage.getUIElement());
		g1 = createEGenericType(this.getFieldEditor());
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		booleanFieldEditorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFieldEditor());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		listFieldEditorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApplicationPackage.getContribution());
		listFieldEditorEClass.getEGenericSuperTypes().add(g1);
		comboFieldEditorEClass.getESuperTypes().add(this.getListFieldEditor());
		listEditorEClass.getESuperTypes().add(this.getListFieldEditor());
		radioGroupFieldEditorEClass.getESuperTypes().add(this.getListFieldEditor());
		g1 = createEGenericType(this.getFieldEditor());
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		scaleFieldEditorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFieldEditor());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		stringFieldEditorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFieldEditor());
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		integerFieldEditorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFieldEditor());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		fileFieldEditorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApplicationPackage.getContribution());
		fileFieldEditorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFieldEditor());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		directoryFieldEditorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApplicationPackage.getContribution());
		directoryFieldEditorEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(preferencesCategoryEClass, PreferencesCategory.class, "PreferencesCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreferencesCategory_Name(), ecorePackage.getEString(), "name", "No Name", 0, 1, PreferencesCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreferencesCategory_ChildCategories(), this.getPreferencesCategory(), this.getPreferencesCategory_ParentCategory(), "childCategories", null, 0, -1, PreferencesCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreferencesCategory_ParentCategory(), this.getPreferencesCategory(), this.getPreferencesCategory_ChildCategories(), "parentCategory", null, 0, 1, PreferencesCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreferencesCategory_Page(), this.getPreferencesPage(), this.getPreferencesPage_Category(), "page", null, 0, 1, PreferencesCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preferencesPageEClass, PreferencesPage.class, "PreferencesPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreferencesPage_Category(), this.getPreferencesCategory(), this.getPreferencesCategory_Page(), "category", null, 0, 1, PreferencesPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreferencesPage_PreferencesScope(), ecorePackage.getEString(), "preferencesScope", null, 0, 1, PreferencesPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEditorEClass, FieldEditor.class, "FieldEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldEditor_Label(), ecorePackage.getEString(), "label", null, 0, 1, FieldEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldEditor_PreferenceName(), ecorePackage.getEString(), "preferenceName", null, 0, 1, FieldEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanFieldEditorEClass, BooleanFieldEditor.class, "BooleanFieldEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanFieldEditor_Style(), this.getBooleanFieldStyle(), "style", null, 0, 1, BooleanFieldEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listFieldEditorEClass, ListFieldEditor.class, "ListFieldEditor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListFieldEditor_Entries(), this.getEntry(), null, "entries", null, 0, -1, ListFieldEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comboFieldEditorEClass, ComboFieldEditor.class, "ComboFieldEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listEditorEClass, ListEditor.class, "ListEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioGroupFieldEditorEClass, RadioGroupFieldEditor.class, "RadioGroupFieldEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scaleFieldEditorEClass, ScaleFieldEditor.class, "ScaleFieldEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScaleFieldEditor_MinValue(), ecorePackage.getEIntegerObject(), "minValue", null, 0, 1, ScaleFieldEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScaleFieldEditor_MaxValue(), ecorePackage.getEIntegerObject(), "maxValue", null, 0, 1, ScaleFieldEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScaleFieldEditor_IncrementValue(), ecorePackage.getEIntegerObject(), "incrementValue", null, 0, 1, ScaleFieldEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringFieldEditorEClass, StringFieldEditor.class, "StringFieldEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerFieldEditorEClass, IntegerFieldEditor.class, "IntegerFieldEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerFieldEditor_MinValidValue(), ecorePackage.getEIntegerObject(), "minValidValue", null, 0, 1, IntegerFieldEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerFieldEditor_MaxValidValue(), ecorePackage.getEIntegerObject(), "maxValidValue", null, 0, 1, IntegerFieldEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileFieldEditorEClass, FileFieldEditor.class, "FileFieldEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directoryFieldEditorEClass, DirectoryFieldEditor.class, "DirectoryFieldEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(booleanFieldStyleEEnum, BooleanFieldStyle.class, "BooleanFieldStyle");
		addEEnumLiteral(booleanFieldStyleEEnum, BooleanFieldStyle.DEFAULT);
		addEEnumLiteral(booleanFieldStyleEEnum, BooleanFieldStyle.SEPARATE_LABEL);

		// Create resource
		createResource(eNS_URI);
	}

} //PreferencesPackageImpl
