// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PracticaParser}.
 */
public interface PracticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PracticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PracticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PracticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(PracticaParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(PracticaParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#funlist}.
	 * @param ctx the parse tree
	 */
	void enterFunlist(PracticaParser.FunlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#funlist}.
	 * @param ctx the parse tree
	 */
	void exitFunlist(PracticaParser.FunlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(PracticaParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(PracticaParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(PracticaParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(PracticaParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(PracticaParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(PracticaParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(PracticaParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(PracticaParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(PracticaParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(PracticaParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(PracticaParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(PracticaParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#vardef2}.
	 * @param ctx the parse tree
	 */
	void enterVardef2(PracticaParser.Vardef2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#vardef2}.
	 * @param ctx the parse tree
	 */
	void exitVardef2(PracticaParser.Vardef2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(PracticaParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(PracticaParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#tvoid}.
	 * @param ctx the parse tree
	 */
	void enterTvoid(PracticaParser.TvoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#tvoid}.
	 * @param ctx the parse tree
	 */
	void exitTvoid(PracticaParser.TvoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(PracticaParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(PracticaParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#varlist2}.
	 * @param ctx the parse tree
	 */
	void enterVarlist2(PracticaParser.Varlist2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#varlist2}.
	 * @param ctx the parse tree
	 */
	void exitVarlist2(PracticaParser.Varlist2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(PracticaParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(PracticaParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#funchead}.
	 * @param ctx the parse tree
	 */
	void enterFunchead(PracticaParser.FuncheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#funchead}.
	 * @param ctx the parse tree
	 */
	void exitFunchead(PracticaParser.FuncheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#typedef1}.
	 * @param ctx the parse tree
	 */
	void enterTypedef1(PracticaParser.Typedef1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#typedef1}.
	 * @param ctx the parse tree
	 */
	void exitTypedef1(PracticaParser.Typedef1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#typedef2_tail}.
	 * @param ctx the parse tree
	 */
	void enterTypedef2_tail(PracticaParser.Typedef2_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#typedef2_tail}.
	 * @param ctx the parse tree
	 */
	void exitTypedef2_tail(PracticaParser.Typedef2_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#mainhead}.
	 * @param ctx the parse tree
	 */
	void enterMainhead(PracticaParser.MainheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#mainhead}.
	 * @param ctx the parse tree
	 */
	void exitMainhead(PracticaParser.MainheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(PracticaParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(PracticaParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(PracticaParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(PracticaParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(PracticaParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(PracticaParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PracticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PracticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(PracticaParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(PracticaParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(PracticaParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(PracticaParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PracticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PracticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(PracticaParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(PracticaParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(PracticaParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(PracticaParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(PracticaParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(PracticaParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#explist1}.
	 * @param ctx the parse tree
	 */
	void enterExplist1(PracticaParser.Explist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#explist1}.
	 * @param ctx the parse tree
	 */
	void exitExplist1(PracticaParser.Explist1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#miif}.
	 * @param ctx the parse tree
	 */
	void enterMiif(PracticaParser.MiifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#miif}.
	 * @param ctx the parse tree
	 */
	void exitMiif(PracticaParser.MiifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#mielse}.
	 * @param ctx the parse tree
	 */
	void enterMielse(PracticaParser.MielseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#mielse}.
	 * @param ctx the parse tree
	 */
	void exitMielse(PracticaParser.MielseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#else1}.
	 * @param ctx the parse tree
	 */
	void enterElse1(PracticaParser.Else1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#else1}.
	 * @param ctx the parse tree
	 */
	void exitElse1(PracticaParser.Else1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#miwhile}.
	 * @param ctx the parse tree
	 */
	void enterMiwhile(PracticaParser.MiwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#miwhile}.
	 * @param ctx the parse tree
	 */
	void exitMiwhile(PracticaParser.MiwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#midowhile}.
	 * @param ctx the parse tree
	 */
	void enterMidowhile(PracticaParser.MidowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#midowhile}.
	 * @param ctx the parse tree
	 */
	void exitMidowhile(PracticaParser.MidowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#mifor}.
	 * @param ctx the parse tree
	 */
	void enterMifor(PracticaParser.MiforContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#mifor}.
	 * @param ctx the parse tree
	 */
	void exitMifor(PracticaParser.MiforContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#for1}.
	 * @param ctx the parse tree
	 */
	void enterFor1(PracticaParser.For1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#for1}.
	 * @param ctx the parse tree
	 */
	void exitFor1(PracticaParser.For1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(PracticaParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(PracticaParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#expcond_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpcond_tail(PracticaParser.Expcond_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#expcond_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpcond_tail(PracticaParser.Expcond_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(PracticaParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(PracticaParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(PracticaParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(PracticaParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(PracticaParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(PracticaParser.OpcompContext ctx);
}