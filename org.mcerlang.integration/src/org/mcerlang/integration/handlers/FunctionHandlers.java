package org.mcerlang.integration.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.protest.integration.lib.textutils.EditorUtils;
import org.protest.integration.lib.textutils.InsertionStringPair;
import org.protest.integration.lib.ui.NullInputException;

public class FunctionHandlers extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String s = event.getCommand().getId();
		String[] sparts = s.split("\\.");
		String id = sparts[sparts.length - 1];
		try {

			InsertionStringPair insertionStringPair = getInsertionString(id);
			EditorUtils.insertText(insertionStringPair);
		} catch (Exception e) {
			// The execution has terminated
		}
		return null;
	}

	protected InsertionStringPair getInsertionString(String id)
			throws NullInputException {
		String before = "";
		String after = "";
		ArrayList<String> input;
		InsertionStringPair ret = null;

		if (id.equals("inserthas_probe_state2")) {
			before += EditorUtils.createCall("mce_erl:has_probe_state",
					"Insert has probe state", "Label", "State");
		}

		else if (id.equals("insertget_probe_state2")) {
			before += EditorUtils.createCall("mce_erl:get_probe_state",
					"Insert get probe state", "Label", "Value");
		}

		else if (id.equals("insertget_probe_state1")) {
			before += EditorUtils.createCall("mce_erl:get_probe_state",
					"Insert get probe state", "Label");
		}

		else if (id.equals("insertdel_probe_state1")) {
			before += EditorUtils.createCall("mce_erl:del_probe_state",
					"Insert del probe state", "Label");
		}

		else if (id.equals("insertprobe_state2")) {
			before += EditorUtils.createCall("mce_erl:probe_state",
					"Insert probe state", "Label", "Value");
		}

		else if (id.equals("insertprobe_state1")) {
			before += EditorUtils.createCall("mce_erl:probe_state",
					"Insert probe state", "Label", "Value");
		}

		else if (id.equals("generatehas_probe_action1")) {
			before += "has_probe_action( Actions)->" + EditorUtils.NEWLINE;
			before += EditorUtils.TAB
					+ "mce_utils:findret(fun mce_erl:match_probe_label/1, Actions).";
		}

		else if (id.equals("insertmatch_probe_label1")) {
			before += EditorUtils.createCall("mce_erl:match_probe_label",
					"Insert match probe level", "Action");
		}

		else if (id.equals("insertprobe_label1")) {
			before += EditorUtils.createCall("mce_erl:probe_label",
					"Insert probe level", "Action");
		}

		else if (id.equals("insertis_probe1")) {
			before += EditorUtils.createCall("mce_erl:is_probe",
					"Insert is probe", "Action");
		}

		else if (id.equals("insertprobe2")) {
			before += EditorUtils.createCall("mce_erl:probe", "Insert probe/2",
					"Label", "Value");
		}

		else if (id.equals("insertprobe1")) {
			before += EditorUtils.createCall("mce_erl:probe", "Insert probe/2",
					"Label");
		}

		else if (id.equals("insertnerase0")) {
		}

		else if (id.equals("insertnput2")) {
		}

		else if (id.equals("insertget1 ")) {
		}

		else if (id.equals("insertnerase0_2")) {
		}

		else if (id.equals("insertget0")) {
		}

		else if (id.equals("insertgerase0_2")) {
		}

		else if (id.equals("insertgerase0")) {
		}

		else if (id.equals("insertgput2")) {
		}

		else if (id.equals("insertgget1")) {
		}

		else if (id.equals("insertgget0")) {
		}

		/*
		 * commandId="org.mcerlang.integration.structures.createmonitor"
		 * 
		 * 
		 * 
		 * 
		 * commandId="org.mcerlang.integration.structures.createdeadlockmonitor"
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * commandId="org.mcerlang.integration.miscallenious.insertlanguage"
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * commandId="org.mcerlang.integration.miscallenious.insertchoicestatement"
		 */
		if (ret != null) {
			return ret;
		}
		return new InsertionStringPair(before, after);

	}
}
