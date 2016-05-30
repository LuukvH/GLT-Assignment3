/**
 */
package platoon.tests;

import junit.textui.TestRunner;

import platoon.LeaderVehicle;
import platoon.PlatoonFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Leader Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeaderVehicleTest extends VehicleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LeaderVehicleTest.class);
	}

	/**
	 * Constructs a new Leader Vehicle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeaderVehicleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Leader Vehicle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LeaderVehicle getFixture() {
		return (LeaderVehicle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatoonFactory.eINSTANCE.createLeaderVehicle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LeaderVehicleTest
