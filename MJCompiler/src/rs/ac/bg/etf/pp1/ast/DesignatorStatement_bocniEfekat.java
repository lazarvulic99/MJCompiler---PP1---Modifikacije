// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatement_bocniEfekat extends DesignatorStatement {

    private Designator Designator;
    private Integer B2;

    public DesignatorStatement_bocniEfekat (Designator Designator, Integer B2) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.B2=B2;
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public Integer getB2() {
        return B2;
    }

    public void setB2(Integer B2) {
        this.B2=B2;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatement_bocniEfekat(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+B2);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatement_bocniEfekat]");
        return buffer.toString();
    }
}
