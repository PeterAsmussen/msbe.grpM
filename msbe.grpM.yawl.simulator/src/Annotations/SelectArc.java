/**
 */
package Annotations;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Annotations.SelectArc#getSourceTransition <em>Source Transition</em>}</li>
 *   <li>{@link Annotations.SelectArc#getTargetTransition <em>Target Transition</em>}</li>
 *   <li>{@link Annotations.SelectArc#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see Annotations.AnnotationsPackage#getSelectArc()
 * @model
 * @generated
 */
public interface SelectArc extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>Source Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Annotations.EnabledTransition#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Transition</em>' reference.
	 * @see #setSourceTransition(EnabledTransition)
	 * @see Annotations.AnnotationsPackage#getSelectArc_SourceTransition()
	 * @see Annotations.EnabledTransition#getOutArcs
	 * @model opposite="outArcs"
	 * @generated
	 */
	EnabledTransition getSourceTransition();

	/**
	 * Sets the value of the '{@link Annotations.SelectArc#getSourceTransition <em>Source Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Transition</em>' reference.
	 * @see #getSourceTransition()
	 * @generated
	 */
	void setSourceTransition(EnabledTransition value);

	/**
	 * Returns the value of the '<em><b>Target Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Annotations.EnabledTransition#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Transition</em>' reference.
	 * @see #setTargetTransition(EnabledTransition)
	 * @see Annotations.AnnotationsPackage#getSelectArc_TargetTransition()
	 * @see Annotations.EnabledTransition#getInArcs
	 * @model opposite="inArcs"
	 * @generated
	 */
	EnabledTransition getTargetTransition();

	/**
	 * Sets the value of the '{@link Annotations.SelectArc#getTargetTransition <em>Target Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Transition</em>' reference.
	 * @see #getTargetTransition()
	 * @generated
	 */
	void setTargetTransition(EnabledTransition value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see Annotations.AnnotationsPackage#getSelectArc_Selected()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link Annotations.SelectArc#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // SelectArc
