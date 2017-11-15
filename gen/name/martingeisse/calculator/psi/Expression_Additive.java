package name.martingeisse.calculator.psi;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.ImmutableList;

public final class Expression_Additive extends Expression {

    public Expression_Additive(@NotNull ASTNode node) {
        super(node);
    }

        public Expression getLeft() {
            return (Expression)(getChildren()[0]);
        }
        public Expression_Additive_Operator getOperator() {
            return (Expression_Additive_Operator)(getChildren()[1]);
        }
        public Expression getRight() {
            return (Expression)(getChildren()[2]);
        }
    

            
    

            
    
}
