package state.model;

import state.manager.SurveyState;

import java.util.UUID;

public class Survey {

    private String surveyId;
    private SurveyState state;
    private boolean isInvisible;
    private boolean isReadOnly;

    public Survey() {
        this.surveyId = String.valueOf(UUID.randomUUID());
    }

    public void setState(SurveyState state) {
        this.state = state;
        state.modifyOptions(this);
    }

    public boolean isInvisible() {
        return isInvisible;
    }

    public void setInvisible(boolean invisible) {
        isInvisible = invisible;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public void setReadOnly(boolean readOnly) {
        isReadOnly = readOnly;
    }
}
