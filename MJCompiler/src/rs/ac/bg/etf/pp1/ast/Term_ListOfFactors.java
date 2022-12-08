// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class Term_ListOfFactors extends TermList {

    private TermList TermList;
    private MulOperator MulOperator;
    private Factor Factor;
    private MoguciFaktorijel MoguciFaktorijel;

    public Term_ListOfFactors (TermList TermList, MulOperator MulOperator, Factor Factor, MoguciFaktorijel MoguciFaktorijel) {
        this.TermList=TermList;
        if(TermList!=null) TermList.setParent(this);
        this.MulOperator=MulOperator;
        if(MulOperator!=null) MulOperator.setParent(this);
        this.Factor=Factor;
        if(Factor!=null) Factor.setParent(this);
        this.MoguciFaktorijel=MoguciFaktorijel;
        if(MoguciFaktorijel!=null) MoguciFaktorijel.setParent(this);
    }

    public TermList getTermList() {
        return TermList;
    }

    public void setTermList(TermList TermList) {
        this.TermList=TermList;
    }

    public MulOperator getMulOperator() {
        return MulOperator;
    }

    public void setMulOperator(MulOperator MulOperator) {
        this.MulOperator=MulOperator;
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
        if(TermList!=null) TermList.accept(visitor);
        if(MulOperator!=null) MulOperator.accept(visitor);
        if(Factor!=null) Factor.accept(visitor);
        if(MoguciFaktorijel!=null) MoguciFaktorijel.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(TermList!=null) TermList.traverseTopDown(visitor);
        if(MulOperator!=null) MulOperator.traverseTopDown(visitor);
        if(Factor!=null) Factor.traverseTopDown(visitor);
        if(MoguciFaktorijel!=null) MoguciFaktorijel.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(TermList!=null) TermList.traverseBottomUp(visitor);
        if(MulOperator!=null) MulOperator.traverseBottomUp(visitor);
        if(Factor!=null) Factor.traverseBottomUp(visitor);
        if(MoguciFaktorijel!=null) MoguciFaktorijel.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Term_ListOfFactors(\n");

        if(TermList!=null)
            buffer.append(TermList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MulOperator!=null)
            buffer.append(MulOperator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

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
        buffer.append(") [Term_ListOfFactors]");
        return buffer.toString();
    }
}
