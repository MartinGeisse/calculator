package name.martingeisse.calculator;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class CalculatorFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull final FileTypeConsumer consumer) {
		consumer.consume(CalculatorFileType.INSTANCE, CalculatorFileType.INSTANCE.getDefaultExtension());
	}

}
