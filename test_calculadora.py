import pytest
from calculadora import soma, subtracao, multiplicacao, divisao

def test_soma():
    assert soma(10, 5) == 15
    assert soma(-2, 2) == 0

def test_subtracao():
    assert subtracao(10, 5) == 5

def test_multiplicacao():
    assert multiplicacao(3, 4) == 12

def test_divisao():
    assert divisao(10, 2) == 5

    with pytest.raises(ValueError):
        divisao(10, 0)