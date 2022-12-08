// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class Term_SingleFactor extends TermList {

    private Factor Factor;
    private MoguciFaktorijel MoguciFaktorijel;

    public Term_SingleFactor (Factor Factor, MoguciFaktorijel MoguciFaktorijel) {
        this.Factor=Factor;
        if(Factor!=null) Factor.setParent(this);
        this.MoguciFaktorijel=MoguciFaktorijel;
        if(MoguciFaktorijel!=null) MoguciFaktorijel.setParent(this);
    }

    public Factor getFactor() {
        return Factor;
    }

    public void setFactor(Factor Factor) {
        this.Factor=Factor;
    }

    public MoguciFaktorijel getMoguciFaktorijel() {
        return MoguciFaktorijel;
    }

    public void setMoguciFaktorijel(MoguciFaktorijel MoguciFaktorijel) {
        this.MoguciFaktorijel=MoguciFaktorijel;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Factor!=null) Factor.accept(visitor);
        if(MoguciFaktorijel!=null) MoguciFaktorijel.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Factor!=null) Factor.traverseTopDown(visitor);
        if(MoguciFaktorijel!=null) MoguciFaktorijel.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Factor!=null) Factor.traverseBottomUp(visitor);
        if(MoguciFaktorijel!=null) MoguciFaktorijel.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Term_SingleFactor(\n");

        if(Factor!=null)
            buffer.append(Factor.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MoguciFaktorijel!=null)
            buffer.append(MoguciFaktorijel.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Term_SingleFactor]");
        return buffer.toString();
    }
}
