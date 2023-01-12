// Generated from java-escape by ANTLR 4.11.1
package edu.yu.pl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UDFLanguageParser}.
 */
public interface UDFLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code In}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 */
	void enterIn(UDFLanguageParser.InContext ctx);
	/**
	 * Exit a parse tree produced by the {@code In}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 */
	void exitIn(UDFLanguageParser.InContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumExpression}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 */
	void enterNumExpression(UDFLanguageParser.NumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExpression}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 */
	void exitNumExpression(UDFLanguageParser.NumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooExpression}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 */
	void enterBooExpression(UDFLanguageParser.BooExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooExpression}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 */
	void exitBooExpression(UDFLanguageParser.BooExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrExpression}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 */
	void enterStrExpression(UDFLanguageParser.StrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrExpression}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 */
	void exitStrExpression(UDFLanguageParser.StrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EndOfInput}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 */
	void enterEndOfInput(UDFLanguageParser.EndOfInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EndOfInput}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 */
	void exitEndOfInput(UDFLanguageParser.EndOfInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void enterNot(UDFLanguageParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void exitNot(UDFLanguageParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(UDFLanguageParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(UDFLanguageParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void enterOr(UDFLanguageParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void exitOr(UDFLanguageParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(UDFLanguageParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(UDFLanguageParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueConstant}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueConstant(UDFLanguageParser.TrueConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueConstant}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueConstant(UDFLanguageParser.TrueConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(UDFLanguageParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(UDFLanguageParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterOrEquals}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEquals(UDFLanguageParser.GreaterOrEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterOrEquals}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEquals(UDFLanguageParser.GreaterOrEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessOrEquals}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEquals(UDFLanguageParser.LessOrEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessOrEquals}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEquals(UDFLanguageParser.LessOrEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseConstant}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseConstant(UDFLanguageParser.FalseConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseConstant}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseConstant(UDFLanguageParser.FalseConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensNumExpr}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterParensNumExpr(UDFLanguageParser.ParensNumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensNumExpr}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitParensNumExpr(UDFLanguageParser.ParensNumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumField}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumField(UDFLanguageParser.NumFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumField}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumField(UDFLanguageParser.NumFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(UDFLanguageParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(UDFLanguageParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(UDFLanguageParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(UDFLanguageParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbsValue}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterAbsValue(UDFLanguageParser.AbsValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsValue}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitAbsValue(UDFLanguageParser.AbsValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegNumExpr}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegNumExpr(UDFLanguageParser.NegNumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegNumExpr}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegNumExpr(UDFLanguageParser.NegNumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumConstant}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumConstant(UDFLanguageParser.NumConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumConstant}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumConstant(UDFLanguageParser.NumConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Concat}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterConcat(UDFLanguageParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Concat}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitConcat(UDFLanguageParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrField}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterStrField(UDFLanguageParser.StrFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrField}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitStrField(UDFLanguageParser.StrFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToString}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterToString(UDFLanguageParser.ToStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToString}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitToString(UDFLanguageParser.ToStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Jion}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterJion(UDFLanguageParser.JionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Jion}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitJion(UDFLanguageParser.JionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterIf(UDFLanguageParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitIf(UDFLanguageParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensStrExpr}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterParensStrExpr(UDFLanguageParser.ParensStrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensStrExpr}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitParensStrExpr(UDFLanguageParser.ParensStrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrConstant}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterStrConstant(UDFLanguageParser.StrConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrConstant}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitStrConstant(UDFLanguageParser.StrConstantContext ctx);
}