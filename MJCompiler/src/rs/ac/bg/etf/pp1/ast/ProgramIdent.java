// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public class ProgramIdent implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String progName;

    public ProgramIdent (String progName) {
        this.progName=progName;
    }

    public String getProgName() {
        return progName;
    }

    public void setProgName(String progName) {
        this.progName=progName;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
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
        buffer.append("ProgramIdent(\n");

        buffer.append(" "+tab+progName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ProgramIdent]");
        return buffer.toString();
    }
}
