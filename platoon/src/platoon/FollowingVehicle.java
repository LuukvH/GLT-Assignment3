/**
 */
package platoon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Following Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.FollowingVehicle#getFollowing <em>Following</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getFollowingVehicle()
 * @model
 * @generated
 */
public interface FollowingVehicle extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Following</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Following</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following</em>' reference.
	 * @see #setFollowing(Vehicle)
	 * @see platoon.PlatoonPackage#getFollowingVehicle_Following()
	 * @model required="true"
	 * @generated
	 */
	Vehicle getFollowing();

	/**
	 * Sets the value of the '{@link platoon.FollowingVehicle#getFollowing <em>Following</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Following</em>' reference.
	 * @see #getFollowing()
	 * @generated
	 */
	void setFollowing(Vehicle value);

} // FollowingVehicle
