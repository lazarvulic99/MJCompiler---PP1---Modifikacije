// generated with ast extension for cup
// version 0.8
// 28/7/2022 21:31:12


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(ExprBasic ExprBasic);
    public void visit(FactorZamena FactorZamena);
    public void visit(StatementVector StatementVector);
    public void visit(VarDeclVectorForMethod VarDeclVectorForMethod);
    public void visit(TermList TermList);
    public void visit(AddOperator AddOperator);
    public void visit(ProgDeclList ProgDeclList);
    public void visit(VariableOpcioneZagrade VariableOpcioneZagrade);
    public void visit(MulOperator MulOperator);
    public void visit(ConstDeclOptions ConstDeclOptions);
    public void visit(Designator Designator);
    public void visit(ConstSingle ConstSingle);
    public void visit(VariableDeclOptions VariableDeclOptions);
    public void visit(VariableComma VariableComma);
    public void visit(MoguciFaktorijel MoguciFaktorijel);
    public void visit(ExprList ExprList);
    public void visit(VariableSingle VariableSingle);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(Konstanta Konstanta);
    public void visit(FactorConst FactorConst);
    public void visit(FactorMoguciMinus FactorMoguciMinus);
    public void visit(Statement Statement);
    public void visit(SingleStatement SingleStatement);
    public void visit(ConstComma ConstComma);
    public void visit(MulOperator_procenat MulOperator_procenat);
    public void visit(MulOperator_podeljeno MulOperator_podeljeno);
    public void visit(MulOperator_puta MulOperator_puta);
    public void visit(AddOperator_minus AddOperator_minus);
    public void visit(AddOperator_plus AddOperator_plus);
    public void visit(AssignOperator AssignOperator);
    public void visit(VariableNameZaNiz VariableNameZaNiz);
    public void visit(Designator_nizMajmun Designator_nizMajmun);
    public void visit(Designator_element Designator_element);
    public void visit(Designator_onlyIdent Designator_onlyIdent);
    public void visit(FactorConst_char FactorConst_char);
    public void visit(FactorConst_boolean FactorConst_boolean);
    public void visit(FactorConst_broj FactorConst_broj);
    public void visit(ArrayDecl ArrayDecl);
    public void visit(FactorZamena_expr FactorZamena_expr);
    public void visit(FactorZamena_new FactorZamena_new);
    public void visit(FactorZamena_const FactorZamena_const);
    public void visit(FactorZamena_izmedjuNizova FactorZamena_izmedjuNizova);
    public void visit(FactorZamena_binarniNiz FactorZamena_binarniNiz);
    public void visit(FactorZamena_maxInArray FactorZamena_maxInArray);
    public void visit(FactorZamena_designator FactorZamena_designator);
    public void visit(FactorMoguciMinus_nijeMinus FactorMoguciMinus_nijeMinus);
    public void visit(FactorMoguciMinus_minus FactorMoguciMinus_minus);
    public void visit(Factor Factor);
    public void visit(MoguciFaktorijel_jesteFaktorijel MoguciFaktorijel_jesteFaktorijel);
    public void visit(MoguciFaktorijel_nijeFaktorijel MoguciFaktorijel_nijeFaktorijel);
    public void visit(Term_ListOfFactors Term_ListOfFactors);
    public void visit(Term_SingleFactor Term_SingleFactor);
    public void visit(Term Term);
    public void visit(Expr_SingleTerm Expr_SingleTerm);
    public void visit(Expr_ListOfTerms Expr_ListOfTerms);
    public void visit(TernaryOp TernaryOp);
    public void visit(Expr_januar Expr_januar);
    public void visit(Expr_avgust Expr_avgust);
    public void visit(Expr Expr);
    public void visit(DesignatorStatement_bocniEfekat DesignatorStatement_bocniEfekat);
    public void visit(DesignatorStatement_minusMinus DesignatorStatement_minusMinus);
    public void visit(DesignatorStatement_doublePlusPlus DesignatorStatement_doublePlusPlus);
    public void visit(DesignatorStatement_ternarni DesignatorStatement_ternarni);
    public void visit(DesignatorStatement_plusPlus DesignatorStatement_plusPlus);
    public void visit(DesignatorStatement_greska DesignatorStatement_greska);
    public void visit(DesignatorStatement_dodela DesignatorStatement_dodela);
    public void visit(Statements Statements);
    public void visit(SingleStatement_gotoStatement SingleStatement_gotoStatement);
    public void visit(SingleStatement_printStatementWithZarez SingleStatement_printStatementWithZarez);
    public void visit(SingleStatement_printStatementWithoutZarez SingleStatement_printStatementWithoutZarez);
    public void visit(SingleStatement_readStatement SingleStatement_readStatement);
    public void visit(SingleStatement_returnStatement SingleStatement_returnStatement);
    public void visit(DesignatorStatement_tildaZaNiz DesignatorStatement_tildaZaNiz);
    public void visit(DesignatorStatement_majmun DesignatorStatement_majmun);
    public void visit(SingleStatement_kvadriraj SingleStatement_kvadriraj);
    public void visit(SingleStatement_designatorStatement SingleStatement_designatorStatement);
    public void visit(LabelIzaGoTo LabelIzaGoTo);
    public void visit(Label Label);
    public void visit(SingleStatementLabel SingleStatementLabel);
    public void visit(Statement_statements Statement_statements);
    public void visit(Statement_singleWithLabel Statement_singleWithLabel);
    public void visit(Statement_singleNoLabel Statement_singleNoLabel);
    public void visit(StatementVector_empty StatementVector_empty);
    public void visit(StatementVector_notEmpty StatementVector_notEmpty);
    public void visit(VarDeclVectorForMethod_empty VarDeclVectorForMethod_empty);
    public void visit(VarDeclVectorForMethod_notEmpty VarDeclVectorForMethod_notEmpty);
    public void visit(MethodName MethodName);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(VariableDecl VariableDecl);
    public void visit(VariableComma_greska VariableComma_greska);
    public void visit(VariableComma_ok VariableComma_ok);
    public void visit(VariableSingle_greska VariableSingle_greska);
    public void visit(VariableSingle_ok VariableSingle_ok);
    public void visit(VariableDeclOptions_multiple VariableDeclOptions_multiple);
    public void visit(VariableDeclOptions_single VariableDeclOptions_single);
    public void visit(VariableOpcioneZagrade_bezZagrada VariableOpcioneZagrade_bezZagrada);
    public void visit(VariableOpcioneZagrade_uglasteZagrade VariableOpcioneZagrade_uglasteZagrade);
    public void visit(VariableDeclList VariableDeclList);
    public void visit(Konstanta_char Konstanta_char);
    public void visit(Konstanta_boolean Konstanta_boolean);
    public void visit(Konstanta_broj Konstanta_broj);
    public void visit(ConstantDecl ConstantDecl);
    public void visit(Type Type);
    public void visit(ConstSingle_greska ConstSingle_greska);
    public void visit(ConstSingle_ok ConstSingle_ok);
    public void visit(ConstComma_greska ConstComma_greska);
    public void visit(ConstComma_ok ConstComma_ok);
    public void visit(ConstDeclOptions_single ConstDeclOptions_single);
    public void visit(ConstDeclOptions_multiple ConstDeclOptions_multiple);
    public void visit(ConstDeclList ConstDeclList);
    public void visit(ProgDeclList_empty ProgDeclList_empty);
    public void visit(ProgDeclList_variable ProgDeclList_variable);
    public void visit(ProgDeclList_const ProgDeclList_const);
    public void visit(ProgramIdent ProgramIdent);
    public void visit(Program Program);

}