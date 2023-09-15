package visitor.model;

import visitor.visitor.Visitor;

public interface BaseModel {

    void accept(Visitor visitor);

}
