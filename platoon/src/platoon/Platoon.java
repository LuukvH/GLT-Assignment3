/**
 */
package platoon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platoon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.Platoon#getLeaderVehicle <em>Leader Vehicle</em>}</li>
 *   <li>{@link platoon.Platoon#getFollowingVehicle <em>Following Vehicle</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getPlatoon()
 * @model
 * @generated
 */
public interface Platoon extends EObject {
	/**
	 * Returns the value of the '<em><b>Leader Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Vehicle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Vehicle</em>' reference.
	 * @see #setLeaderVehicle(LeaderVehicle)
	 * @see platoon.PlatoonPackage#getPlatoon_LeaderVehicle()
	 * @model required="true"
	 * @generated
	 */
	LeaderVehicle getLeaderVehicle();

	/**
	 * Sets the value of the '{@link platoon.Platoon#getLeaderVehicle <em>Leader Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Vehicle</em>' reference.
	 * @see #getLeaderVehicle()
	 * @generated
	 */
	void setLeaderVehicle(LeaderVehicle value);

	/**
	 * Returns the value of the '<em><b>Following Vehicle</b></em>' reference list.
	 * The list contents are of type {@link platoon.FollowingVehicle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Following Vehicle</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following Vehicle</em>' reference list.
	 * @see platoon.PlatoonPackage#getPlatoon_FollowingVehicle()
	 * @model
	 * @generated
	 */
	EList<FollowingVehicle> getFollowingVehicle();

} // Platoon
