// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class VariableOpcioneZagrade_uglasteZagrade extends VariableOpcioneZagrade {

    public VariableOpcioneZagrade_uglasteZagrade () {
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
        buffer.append("VariableOpcioneZagrade_uglasteZagrade(\n");

        buffer.append(tab);
        buffer.append(") [VariableOpcioneZagrade_uglasteZagrade]");
        return buffer.toString();
    }
}
