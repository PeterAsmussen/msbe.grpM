/**
 */
package yawlnet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.Place#getType <em>Type</em>}</li>
 *   <li>{@link yawlnet.Place#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see yawlnet.YawlnetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(PlaceType)
	 * @see yawlnet.YawlnetPackage#getPlace_Type()
	 * @model containment="true"
	 * @generated
	 */
	PlaceType getType();

	/**
	 * Sets the value of the '{@link yawlnet.Place#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PlaceType value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link yawlnet.Token#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' reference.
	 * @see #setTokens(Token)
	 * @see yawlnet.YawlnetPackage#getPlace_Tokens()
	 * @see yawlnet.Token#getPlace
	 * @model opposite="place"
	 * @generated
	 */
	Token getTokens();

	/**
	 * Sets the value of the '{@link yawlnet.Place#getTokens <em>Tokens</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' reference.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(Token value);

} // Place
