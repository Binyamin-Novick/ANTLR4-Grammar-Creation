// Generated from java-escape by ANTLR 4.11.1
package edu.yu.pl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UDFLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UDFLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code In}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(UDFLanguageParser.InContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumExpression}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpression(UDFLanguageParser.NumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooExpression}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooExpression(UDFLanguageParser.BooExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrExpression}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpression(UDFLanguageParser.StrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndOfInput}
	 * labeled alternative in {@link UDFLanguageParser#userField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfInput(UDFLanguageParser.EndOfInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(UDFLanguageParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(UDFLanguageParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(UDFLanguageParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(UDFLanguageParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueConstant}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueConstant(UDFLanguageParser.TrueConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(UDFLanguageParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterOrEquals}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEquals(UDFLanguageParser.GreaterOrEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessOrEquals}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEquals(UDFLanguageParser.LessOrEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseConstant}
	 * labeled alternative in {@link UDFLanguageParser#booExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseConstant(UDFLanguageParser.FalseConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensNumExpr}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensNumExpr(UDFLanguageParser.ParensNumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumField}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumField(UDFLanguageParser.NumFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(UDFLanguageParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(UDFLanguageParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbsValue}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsValue(UDFLanguageParser.AbsValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegNumExpr}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegNumExpr(UDFLanguageParser.NegNumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumConstant}
	 * labeled alternative in {@link UDFLanguageParser#numExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumConstant(UDFLanguageParser.NumConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Concat}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(UDFLanguageParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrField}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrField(UDFLanguageParser.StrFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToString}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToString(UDFLanguageParser.ToStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Jion}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJion(UDFLanguageParser.JionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(UDFLanguageParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensStrExpr}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensStrExpr(UDFLanguageParser.ParensStrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrConstant}
	 * labeled alternative in {@link UDFLanguageParser#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrConstant(UDFLanguageParser.StrConstantContext ctx);
}