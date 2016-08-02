/**
 */
package Annotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Annotations.AnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Annotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://annotations.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "an";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsPackage eINSTANCE = Annotations.impl.AnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Annotations.impl.EnabledTransitionImpl <em>Enabled Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Annotations.impl.EnabledTransitionImpl
	 * @see Annotations.impl.AnnotationsPackageImpl#getEnabledTransition()
	 * @generated
	 */
	int ENABLED_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>In Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__IN_ARCS = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__OUT_ARCS = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enabled Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 2;

//	/**
//	 * The operation id for the '<em>Get Description</em>' operation.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ENABLED_TRANSITION___GET_DESCRIPTION = NetannotationsPackage.OBJECT_ANNOTATION___GET_DESCRIPTION;
//
//	/**
//	 * The number of operations of the '<em>Enabled Transition</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int ENABLED_TRANSITION_OPERATION_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Annotations.impl.SelectArcImpl <em>Select Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Annotations.impl.SelectArcImpl
	 * @see Annotations.impl.AnnotationsPackageImpl#getSelectArc()
	 * @generated
	 */
	int SELECT_ARC = 1;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Source Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__SOURCE_TRANSITION = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__TARGET_TRANSITION = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC__SELECTED = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Select Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC___GET_DESCRIPTION = NetannotationsPackage.OBJECT_ANNOTATION___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Select Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ARC_OPERATION_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Annotations.impl.MarkingImpl <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Annotations.impl.MarkingImpl
	 * @see Annotations.impl.AnnotationsPackageImpl#getMarking()
	 * @generated
	 */
	int MARKING = 2;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__VALUE = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;
//
//	/**
//	 * The operation id for the '<em>Get Description</em>' operation.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int MARKING___GET_DESCRIPTION = NetannotationsPackage.OBJECT_ANNOTATION___GET_DESCRIPTION;
//
//	/**
//	 * The operation id for the '<em>Get Annotation Attribute</em>' operation.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int MARKING___GET_ANNOTATION_ATTRIBUTE = NetannotationsPackage.OBJECT_ANNOTATION_OPERATION_COUNT + 0;
//
//	/**
//	 * The number of operations of the '<em>Marking</em>' class.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 * @ordered
//	 */
//	int MARKING_OPERATION_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link Annotations.EnabledTransition <em>Enabled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabled Transition</em>'.
	 * @see Annotations.EnabledTransition
	 * @generated
	 */
	EClass getEnabledTransition();

	/**
	 * Returns the meta object for the reference list '{@link Annotations.EnabledTransition#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arcs</em>'.
	 * @see Annotations.EnabledTransition#getInArcs()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EReference getEnabledTransition_InArcs();

	/**
	 * Returns the meta object for the reference list '{@link Annotations.EnabledTransition#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arcs</em>'.
	 * @see Annotations.EnabledTransition#getOutArcs()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EReference getEnabledTransition_OutArcs();

	/**
	 * Returns the meta object for class '{@link Annotations.SelectArc <em>Select Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Arc</em>'.
	 * @see Annotations.SelectArc
	 * @generated
	 */
	EClass getSelectArc();

	/**
	 * Returns the meta object for the reference '{@link Annotations.SelectArc#getSourceTransition <em>Source Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Transition</em>'.
	 * @see Annotations.SelectArc#getSourceTransition()
	 * @see #getSelectArc()
	 * @generated
	 */
	EReference getSelectArc_SourceTransition();

	/**
	 * Returns the meta object for the reference '{@link Annotations.SelectArc#getTargetTransition <em>Target Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Transition</em>'.
	 * @see Annotations.SelectArc#getTargetTransition()
	 * @see #getSelectArc()
	 * @generated
	 */
	EReference getSelectArc_TargetTransition();

	/**
	 * Returns the meta object for the attribute '{@link Annotations.SelectArc#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see Annotations.SelectArc#isSelected()
	 * @see #getSelectArc()
	 * @generated
	 */
	EAttribute getSelectArc_Selected();

	/**
	 * Returns the meta object for class '{@link Annotations.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see Annotations.Marking
	 * @generated
	 */
	EClass getMarking();

	/**
	 * Returns the meta object for the attribute '{@link Annotations.Marking#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Annotations.Marking#getValue()
	 * @see #getMarking()
	 * @generated
	 */
	EAttribute getMarking_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationsFactory getAnnotationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Annotations.impl.EnabledTransitionImpl <em>Enabled Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Annotations.impl.EnabledTransitionImpl
		 * @see Annotations.impl.AnnotationsPackageImpl#getEnabledTransition()
		 * @generated
		 */
		EClass ENABLED_TRANSITION = eINSTANCE.getEnabledTransition();

		/**
		 * The meta object literal for the '<em><b>In Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_TRANSITION__IN_ARCS = eINSTANCE.getEnabledTransition_InArcs();

		/**
		 * The meta object literal for the '<em><b>Out Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_TRANSITION__OUT_ARCS = eINSTANCE.getEnabledTransition_OutArcs();

		/**
		 * The meta object literal for the '{@link Annotations.impl.SelectArcImpl <em>Select Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Annotations.impl.SelectArcImpl
		 * @see Annotations.impl.AnnotationsPackageImpl#getSelectArc()
		 * @generated
		 */
		EClass SELECT_ARC = eINSTANCE.getSelectArc();

		/**
		 * The meta object literal for the '<em><b>Source Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ARC__SOURCE_TRANSITION = eINSTANCE.getSelectArc_SourceTransition();

		/**
		 * The meta object literal for the '<em><b>Target Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ARC__TARGET_TRANSITION = eINSTANCE.getSelectArc_TargetTransition();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_ARC__SELECTED = eINSTANCE.getSelectArc_Selected();

		/**
		 * The meta object literal for the '{@link Annotations.impl.MarkingImpl <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Annotations.impl.MarkingImpl
		 * @see Annotations.impl.AnnotationsPackageImpl#getMarking()
		 * @generated
		 */
		EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKING__VALUE = eINSTANCE.getMarking_Value();

	}

} //AnnotationsPackage
