/**
 */
package Annotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Annotations.AnnotationsPackage
 * @generated
 */
public interface AnnotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsFactory eINSTANCE = Annotations.impl.AnnotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enabled Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enabled Transition</em>'.
	 * @generated
	 */
	EnabledTransition createEnabledTransition();

	/**
	 * Returns a new object of class '<em>Select Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Arc</em>'.
	 * @generated
	 */
	SelectArc createSelectArc();

	/**
	 * Returns a new object of class '<em>Marking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marking</em>'.
	 * @generated
	 */
	Marking createMarking();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnnotationsPackage getAnnotationsPackage();

} //AnnotationsFactory
