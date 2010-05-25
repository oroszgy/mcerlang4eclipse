package org.mcerlang.integration.handlers;

import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.protest.integration.lib.textutils.EditorUtils;
import org.protest.integration.lib.textutils.InsertionStringPair;
import org.protest.integration.lib.ui.DynamicInputDialog;
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
			before += "mcerlang:neraase()";
		}

		else if (id.equals("insertnput2")) {
			before += EditorUtils.createCall("mcerlang:nput", "Insert nput/2",
					"Key", "Value");
		}

		else if (id.equals("insertget1 ")) {
			before += EditorUtils.createCall("mcerlang:nget", "Insert get/1",
					"Key");
		}

		else if (id.equals("insertnerase0_2")) {
			before += EditorUtils.createCall("mcerlang:nerase",
					"Insert nerase/2", "Key", "Value");
		}

		else if (id.equals("insertget0")) {
			before += "mcerlang:nget()";
		}

		else if (id.equals("insertgerase0_2")) {
			before += EditorUtils.createCall("mcerlang:gerase",
					"Insert gerase/2", "Key", "Value");
		}

		else if (id.equals("insertgerase0")) {
			before += "mcerlang:gerase()";
		}

		else if (id.equals("insertgput2")) {
			before += EditorUtils.createCall("mcerlang:gput", "Insert gput/2",
					"Key", "Value");
		}

		else if (id.equals("insertgget1")) {
			before += EditorUtils.createCall("mcerlang:gget", "Insert gget/1",
					"Key");
		}

		else if (id.equals("insertgget0")) {
			before += "mcerlang:gget()";
		}

		else if (id.equals("createmonitor")) {
			ArrayList<String> inp = DynamicInputDialog.run("Create monitor",
					"Insert monitor type (safety | buchi)");
			before += "-module(monitor)." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;

			before += "-export([init/1,stateChange/3,monitorType/0])."
					+ EditorUtils.NEWLINE + EditorUtils.NEWLINE;

			before += "-include(\"state.hrl\")." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;

			before += "-include(\"process.hrl\")." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;

			before += "-behaviour(mce_behav_monitor)." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;

			before += "%% monitorType :: atom() = safety | buchi"
					+ EditorUtils.NEWLINE;
			before += "monitorType() -> " + inp.get(0) + "."
					+ EditorUtils.NEWLINE + EditorUtils.NEWLINE;

			before += "%% Monitor state initializer" + EditorUtils.NEWLINE;
			before += "%% init( State :: state() ) -> {ok, initialState :: state() }"
					+ EditorUtils.NEWLINE;
			before += "init(State) -> " + EditorUtils.NEWLINE;
			before += EditorUtils.TAB + "{ok, State}." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;

			before += "%% Evaluated after each system transition"
					+ EditorUtils.NEWLINE;
			before += "%% State :: state() Current system state"
					+ EditorUtils.NEWLINE;
			before += "%% MonState :: monState() Current monitor state (from previous transition)"
					+ EditorUtils.NEWLINE;
			before += "%% Stack :: stack() System stack containing functions executed in state transition"
					+ EditorUtils.NEWLINE;
			before += "stateChange(State,MonState,Stack) ->"
					+ EditorUtils.NEWLINE;
			before += "%% To be completed" + EditorUtils.NEWLINE;
			before += EditorUtils.TAB + "{ok, Monstate}.";
		}

		else if (id.equals("createdeadlockmonitor")) {

			before += "-module(monitor_deadlock)." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;

			before += "-export([init/1,stateChange/3,monitorType/0])."
					+ EditorUtils.NEWLINE + EditorUtils.NEWLINE;

			before += "-include(\"state.hrl\")." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;

			before += "-include(\"process.hrl\")." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;

			before += "-behaviour(mce_behav_monitor)." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;

			before += "%% monitorType :: atom() = safety | buchi"
					+ EditorUtils.NEWLINE;
			before += "monitorType() -> safety." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;
			before += "%% Monitor state initializer" + EditorUtils.NEWLINE;
			before += "init(State) -> {ok,State}." + EditorUtils.NEWLINE
					+ EditorUtils.NEWLINE;

			before += "%% Evaluated after each system transition"
					+ EditorUtils.NEWLINE;
			before += "%% State :: state() Current system state"
					+ EditorUtils.NEWLINE;
			before += "%% MonState :: monState() Current monitor state"
					+ EditorUtils.NEWLINE;
			before += "stateChange(State,MonState,_) ->" + EditorUtils.NEWLINE;
			before += EditorUtils.TAB
					+ "%% Check system state to identify a possible deadlock situation"
					+ EditorUtils.NEWLINE;
			before += EditorUtils.TAB + "case is_deadlocked(State) of"
					+ EditorUtils.NEWLINE;
			before += EditorUtils.TAB
					+ "%% Deadlock identified. Execution will fail.%%"
					+ EditorUtils.NEWLINE;
			before += EditorUtils.TAB + "true -> deadlock;"
					+ EditorUtils.NEWLINE;
			before += EditorUtils.TAB
					+ "%% Non deadlock situation. Monitor state returned unchanged"
					+ EditorUtils.NEWLINE;
			before += EditorUtils.TAB + "false -> {ok, MonState}"
					+ EditorUtils.NEWLINE;
			before += "end." + EditorUtils.NEWLINE + EditorUtils.NEWLINE;

			before += "%% Checks system state in search for deadlock situations"
					+ EditorUtils.NEWLINE;
			before += "%% is_deadlocked :: bool()" + EditorUtils.NEWLINE;
			before += "is_deadlocked(State) ->" + EditorUtils.NEWLINE;
			before += EditorUtils.TAB + "State#state.ether =:= [] andalso"
					+ EditorUtils.NEWLINE;
			before += EditorUtils.TAB
					+ "case mce_utils:find(fun (P) -> P#process.status =/= blocked end,"
					+ EditorUtils.NEWLINE;
			before += EditorUtils.TAB + EditorUtils.TAB + EditorUtils.TAB
					+ "mce_erl:allProcesses(State)) of" + EditorUtils.NEWLINE;
			before += EditorUtils.TAB
					+ EditorUtils.TAB
					+ "%% False if there exist at least one process that is not blocked"
					+ EditorUtils.NEWLINE;
			before += EditorUtils.TAB + EditorUtils.TAB + "{ok, _} -> false;"
					+ EditorUtils.NEWLINE;
			before += EditorUtils.TAB + EditorUtils.TAB + "no -> true"
					+ EditorUtils.NEWLINE;
			before += EditorUtils.TAB + "end.";
		}

		else if (id.equals("insertlanguage")) {
			before += "-language(erlang).";
		}

		else if (id.equals("insertchoicestatement")) {
			before += "mce_erl:choice([{ }])";
		}

		if (ret != null) {
			return ret;
		}
		return new InsertionStringPair(before, after);

	}
}
