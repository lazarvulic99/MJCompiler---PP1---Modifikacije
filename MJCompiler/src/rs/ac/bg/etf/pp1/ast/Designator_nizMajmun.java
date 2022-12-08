// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class Designator_nizMajmun extends Designator {

    private VariableNameZaNiz VariableNameZaNiz;
    private Expr Expr;
    private Integer B3;

    public Designator_nizMajmun (VariableNameZaNiz VariableNameZaNiz, Expr Expr, Integer B3) {
        this.VariableNameZaNiz=VariableNameZaNiz;
        if(VariableNameZaNiz!=null) VariableNameZaNiz.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.B3=B3;
    }

    public VariableNameZaNiz getVariableNameZaNiz() {
        return VariableNameZaNiz;
    }

    public void setVariableNameZaNiz(VariableNameZaNiz VariableNameZaNiz) {
        this.VariableNameZaNiz=VariableNameZaNiz;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public Integer getB3() {
        return B3;
    }

    public void setB3(Integer B3) {
        this.B3=B3;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VariableNameZaNiz!=null) VariableNameZaNiz.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VariableNameZaNiz!=null) VariableNameZaNiz.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VariableNameZaNiz!=null) VariableNameZaNiz.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Designator_nizMajmun(\n");

        if(VariableNameZaNiz!=null)
            buffer.append(VariableNameZaNiz.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+B3);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Designator_nizMajmun]");
        return buffer.toString();
    }
}
