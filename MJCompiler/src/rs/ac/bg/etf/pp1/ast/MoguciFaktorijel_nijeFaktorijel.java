// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class MoguciFaktorijel_nijeFaktorijel extends MoguciFaktorijel {

    public MoguciFaktorijel_nijeFaktorijel () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MoguciFaktorijel_nijeFaktorijel(\n");

        buffer.append(tab);
        buffer.append(") [MoguciFaktorijel_nijeFaktorijel]");
        return buffer.toString();
    }
}
