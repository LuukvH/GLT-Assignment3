/**
 */
package platoon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.Constraints#getLbound <em>Lbound</em>}</li>
 *   <li>{@link platoon.Constraints#getUbound <em>Ubound</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getConstraints()
 * @model
 * @generated
 */
public interface Constraints extends EObject {

	/**
	 * Returns the value of the '<em><b>Lbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbound</em>' attribute.
	 * @see #setLbound(int)
	 * @see platoon.PlatoonPackage#getConstraints_Lbound()
	 * @model
	 * @generated
	 */
	int getLbound();

	/**
	 * Sets the value of the '{@link platoon.Constraints#getLbound <em>Lbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbound</em>' attribute.
	 * @see #getLbound()
	 * @generated
	 */
	void setLbound(int value);

	/**
	 * Returns the value of the '<em><b>Ubound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ubound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ubound</em>' attribute.
	 * @see #setUbound(int)
	 * @see platoon.PlatoonPackage#getConstraints_Ubound()
	 * @model
	 * @generated
	 */
	int getUbound();

	/**
	 * Sets the value of the '{@link platoon.Constraints#getUbound <em>Ubound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ubound</em>' attribute.
	 * @see #getUbound()
	 * @generated
	 */
	void setUbound(int value);
} // Constraints
