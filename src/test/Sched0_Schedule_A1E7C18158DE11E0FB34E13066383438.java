/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class Sched0_Schedule_A1E7C18158DE11E0FB34E13066383438 extends
		com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public Sched0_Schedule_A1E7C18158DE11E0FB34E13066383438(IContainer parent,
			String name) {
		super(parent, name, "A1E7C18158DE11E0FB34E13066383438");
		setThinkMax(10000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(),
				null, 1, "Page title verification failed"));
		this.addEventBehavior(new RPTEventStructure(
				new HTTPResponseCodeVPEvent(), null, 1,
				"Response code verification failed"));
		this.addEventBehavior(new RPTEventStructure(
				new HTTPResponseSizeVPEvent(), null, 1,
				"Response size verification failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTErrorVPEvent(),
				null, 1, "Content Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(),
				null, 1, "Connection failed"));
		this.addEventBehavior(new RPTEventStructure(
				new RPTAuthenticationEvent(), null, 1, "Authentication failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTStopUserEvent("End of datapool reached"), 1,
				"End of datapool reached"));
		this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(),
				null, 1, "Failed to extract reference"));
		this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(),
				null, 1, "Substitution failed"));
		this.addEventBehavior(new RPTEventStructure(
				new RPTServerTimeoutEvent(), null, 1, "Timeout"));
		this.addEventBehavior(new RPTEventStructure(
				new RPTCustomCodeVPFailureEvent(), null, 1,
				"Custom Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(
				new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent(
						"Custom Code reported an unhandled exception"), 1,
				"Custom Code reported an unhandled exception"));

		this.addUserGroup(new UserGroup_1(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "User Group 1", "A1E7C18158E5DA14FB34E13066383438");

			setNumUsers(100.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario",
					"A1E7C18158E60126FB34E13066383438") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Test0_Test_A1E7BF27A2853C80DED1B83533633766(
							this, "A1E7C18160ED35F0FB34E13066383438") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(
							this));
					super.execute();
				}
			};

			return scenario;
		}

	}

}