/**
 */
package Annotations;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabled Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Annotations.EnabledTransition#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link Annotations.EnabledTransition#getOutArcs <em>Out Arcs</em>}</li>
 * </ul>
 *
 * @see Annotations.AnnotationsPackage#getEnabledTransition()
 * @model
 * @generated
 */
public interface EnabledTransition extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
	 * The list contents are of type {@link Annotations.SelectArc}.
	 * It is bidirectional and its opposite is '{@link Annotations.SelectArc#getTargetTransition <em>Target Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arcs</em>' reference list.
	 * @see Annotations.AnnotationsPackage#getEnabledTransition_InArcs()
	 * @see Annotations.SelectArc#getTargetTransition
	 * @model opposite="targetTransition"
	 * @generated
	 */
	EList<SelectArc> getInArcs();

	/**
	 * Returns the value of the '<em><b>Out Arcs</b></em>' reference list.
	 * The list contents are of type {@link Annotations.SelectArc}.
	 * It is bidirectional and its opposite is '{@link Annotations.SelectArc#getSourceTransition <em>Source Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arcs</em>' reference list.
	 * @see Annotations.AnnotationsPackage#getEnabledTransition_OutArcs()
	 * @see Annotations.SelectArc#getSourceTransition
	 * @model opposite="sourceTransition"
	 * @generated
	 */
	EList<SelectArc> getOutArcs();

} // EnabledTransition
