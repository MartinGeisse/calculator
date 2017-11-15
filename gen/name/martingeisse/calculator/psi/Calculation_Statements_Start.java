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

public final class Calculation_Statements_Start extends Calculation_Statements {

    public Calculation_Statements_Start(@NotNull ASTNode node) {
        super(node);
    }

    

            
    

            
    
        public ImmutableList<Statement> getAll() {
                            return ImmutableList.of();
                    }

        public void addAllTo(List<Statement> list) {
                    }

        public void addAllTo(ImmutableList.Builder<Statement> builder) {
                    }

    
}
