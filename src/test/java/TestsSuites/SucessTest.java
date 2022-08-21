package TestsSuites;

import TestCases.RealizarCompraComSucesso;
import TestCases.RealizarCompraComSucessoCsv;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({RealizarCompraComSucesso.class, RealizarCompraComSucessoCsv.class})
public class SucessTest {
}
