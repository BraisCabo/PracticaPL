// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PracticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PracticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PracticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PracticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(PracticaParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#funlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunlist(PracticaParser.FunlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(PracticaParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(PracticaParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(PracticaParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(PracticaParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(PracticaParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(PracticaParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#vardef2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef2(PracticaParser.Vardef2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(PracticaParser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#tvoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTvoid(PracticaParser.TvoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(PracticaParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#varlist2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist2(PracticaParser.Varlist2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(PracticaParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#funchead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunchead(PracticaParser.FuncheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#typedef1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef1(PracticaParser.Typedef1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#typedef2_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef2_tail(PracticaParser.Typedef2_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#mainhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainhead(PracticaParser.MainheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(PracticaParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(PracticaParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(PracticaParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(PracticaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp1(PracticaParser.Exp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(PracticaParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PracticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(PracticaParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#subpparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpparamlist(PracticaParser.SubpparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(PracticaParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#explist1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist1(PracticaParser.Explist1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(PracticaParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(PracticaParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#else1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse1(PracticaParser.Else1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(PracticaParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#dowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(PracticaParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(PracticaParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#for1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor1(PracticaParser.For1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(PracticaParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#expcond_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond_tail(PracticaParser.Expcond_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(PracticaParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(PracticaParser.FactorcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(PracticaParser.OpcompContext ctx);
}