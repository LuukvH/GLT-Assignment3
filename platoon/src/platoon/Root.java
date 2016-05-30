/**
 */
package platoon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.Root#getPlatoon <em>Platoon</em>}</li>
 *   <li>{@link platoon.Root#getRoute <em>Route</em>}</li>
 *   <li>{@link platoon.Root#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Platoon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platoon</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platoon</em>' reference.
	 * @see #setPlatoon(Platoon)
	 * @see platoon.PlatoonPackage#getRoot_Platoon()
	 * @model required="true"
	 * @generated
	 */
	Platoon getPlatoon();

	/**
	 * Sets the value of the '{@link platoon.Root#getPlatoon <em>Platoon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platoon</em>' reference.
	 * @see #getPlatoon()
	 * @generated
	 */
	void setPlatoon(Platoon value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see platoon.PlatoonPackage#getRoot_Route()
	 * @model required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link platoon.Root#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference.
	 * @see #setConstraints(Constraints)
	 * @see platoon.PlatoonPackage#getRoot_Constraints()
	 * @model required="true"
	 * @generated
	 */
	Constraints getConstraints();

	/**
	 * Sets the value of the '{@link platoon.Root#getConstraints <em>Constraints</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Constraints value);

} // Root
