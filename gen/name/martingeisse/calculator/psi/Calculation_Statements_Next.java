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

public final class Calculation_Statements_Next extends Calculation_Statements {

    public Calculation_Statements_Next(@NotNull ASTNode node) {
        super(node);
    }

        public Calculation_Statements getPrevious() {
            return (Calculation_Statements)(getChildren()[0]);
        }
        public Statement getElement() {
            return (Statement)(getChildren()[1]);
        }
    

            
    

            
    
        public ImmutableList<Statement> getAll() {
            ImmutableList.Builder<Statement> builder = ImmutableList.builder();
            addAllTo(builder);
            return builder.build();
        }

        public void addAllTo(List<Statement> list) {
            getPrevious().addAllTo(list);
            list.add(getElement());
        }

        public void addAllTo(ImmutableList.Builder<Statement> builder) {
            getPrevious().addAllTo(builder);
            builder.add(getElement());
        }

    
}
