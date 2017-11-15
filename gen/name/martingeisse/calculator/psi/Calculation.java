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

public final class Calculation extends ASTWrapperPsiElement {

    public Calculation(@NotNull ASTNode node) {
        super(node);
    }

        public Calculation_Statements getStatements() {
            return (Calculation_Statements)(getChildren()[0]);
        }
    

            
    

            
    
}
