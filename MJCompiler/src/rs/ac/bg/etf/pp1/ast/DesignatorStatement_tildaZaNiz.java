// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatement_tildaZaNiz extends SingleStatement {

    private VariableNameZaNiz VariableNameZaNiz;
    private Integer B2;

    public DesignatorStatement_tildaZaNiz (VariableNameZaNiz VariableNameZaNiz, Integer B2) {
        this.VariableNameZaNiz=VariableNameZaNiz;
        if(VariableNameZaNiz!=null) VariableNameZaNiz.setParent(this);
        this.B2=B2;
    }

    public VariableNameZaNiz getVariableNameZaNiz() {
        return VariableNameZaNiz;
    }

    public void setVariableNameZaNiz(VariableNameZaNiz VariableNameZaNiz) {
        this.VariableNameZaNiz=VariableNameZaNiz;
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
        if(VariableNameZaNiz!=null) VariableNameZaNiz.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VariableNameZaNiz!=null) VariableNameZaNiz.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VariableNameZaNiz!=null) VariableNameZaNiz.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatement_tildaZaNiz(\n");

        if(VariableNameZaNiz!=null)
            buffer.append(VariableNameZaNiz.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+B2);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatement_tildaZaNiz]");
        return buffer.toString();
    }
}
