/**
 */
package platoon.tests;

import junit.textui.TestRunner;

import platoon.PlatoonFactory;
import platoon.TurnRight;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Turn Right</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurnRightTest extends routeCommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TurnRightTest.class);
	}

	/**
	 * Constructs a new Turn Right test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnRightTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Turn Right test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TurnRight getFixture() {
		return (TurnRight)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatoonFactory.eINSTANCE.createTurnRight());
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

} //TurnRightTest
