package state;

import state.manager.SurveyState;
import state.manager.impl.AnsweredState;
import state.manager.impl.CreatedState;
import state.manager.impl.DeliveredState;
import state.manager.impl.LoggedState;
import state.model.Survey;

public class Main {
    public static void main(String[] args) {
        Survey survey = new Survey();
        SurveyState createdState = new CreatedState();
        SurveyState loggedState = new LoggedState();
        SurveyState deliveredState = new DeliveredState();
        SurveyState answeredState = new AnsweredState();
        survey.setState(createdState);
        survey.setState(loggedState);
        survey.setState(deliveredState);
        survey.setState(answeredState);
    }
}