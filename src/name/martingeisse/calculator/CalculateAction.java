package name.martingeisse.calculator;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 *
 */
public class CalculateAction extends AnAction {

	public CalculateAction() {
		super("calculate");
	}

	@Override
	public void actionPerformed(AnActionEvent anActionEvent) {
		System.out.println("calculating... done!");
	}

}
