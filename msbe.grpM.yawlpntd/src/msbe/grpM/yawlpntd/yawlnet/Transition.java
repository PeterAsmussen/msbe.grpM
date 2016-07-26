/**
 */
package msbe.grpM.yawlpntd.yawlnet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link msbe.grpM.yawlpntd.yawlnet.Transition#getJoin <em>Join</em>}</li>
 *   <li>{@link msbe.grpM.yawlpntd.yawlnet.Transition#getSplit <em>Split</em>}</li>
 * </ul>
 *
 * @see msbe.grpM.yawlpntd.yawlnet.YawlnetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends org.pnml.tools.epnk.pnmlcoremodel.Transition {
	/**
	 * Returns the value of the '<em><b>Join</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' containment reference.
	 * @see #setJoin(ControlType)
	 * @see msbe.grpM.yawlpntd.yawlnet.YawlnetPackage#getTransition_Join()
	 * @model containment="true"
	 * @generated
	 */
	ControlType getJoin();

	/**
	 * Sets the value of the '{@link msbe.grpM.yawlpntd.yawlnet.Transition#getJoin <em>Join</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' containment reference.
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(ControlType value);

	/**
	 * Returns the value of the '<em><b>Split</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split</em>' containment reference.
	 * @see #setSplit(ControlType)
	 * @see msbe.grpM.yawlpntd.yawlnet.YawlnetPackage#getTransition_Split()
	 * @model containment="true"
	 * @generated
	 */
	ControlType getSplit();

	/**
	 * Sets the value of the '{@link msbe.grpM.yawlpntd.yawlnet.Transition#getSplit <em>Split</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split</em>' containment reference.
	 * @see #getSplit()
	 * @generated
	 */
	void setSplit(ControlType value);

} // Transition
