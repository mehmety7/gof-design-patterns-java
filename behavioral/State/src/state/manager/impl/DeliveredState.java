package state.manager.impl;

import state.manager.SurveyState;
import state.model.Survey;

public class DeliveredState implements SurveyState {

    @Override
    public void modifyOptions(Survey survey) {
        survey.setInvisible(true);
        survey.setReadOnly(true);
        System.out.println("Survey options reconfigured according to state: " + this.getClass().getSimpleName());
        System.out.println("New configs: " + survey.isInvisible() + " " + survey.isReadOnly());
    }
}
