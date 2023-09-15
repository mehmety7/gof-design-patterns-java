package state.manager.impl;

import state.manager.SurveyState;
import state.model.Survey;

public class AnsweredState implements SurveyState {

    @Override
    public void modifyOptions(Survey survey) {
        survey.setInvisible(false);
        survey.setReadOnly(false);
        System.out.println("Survey options reconfigured according to state: " + this.getClass().getSimpleName());
        System.out.println("New configs: " + survey.isInvisible() + " " + survey.isReadOnly());
    }
}
