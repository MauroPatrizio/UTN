import pytest
from functions import *

@pytest.mark.parametrize("dni, res",[
    ("35076871", True),
    ("asdfasdf", False),
    ("3244", False),
])
def test_dni_isvalid(dni, res):
    assert dni_isvalid(dni) == res

@pytest.mark.parametrize("sentence, res",[
    ("cosos coso", 4),
    ("mercedez", 8),
    ("maria" , 5),
])
def test_long_string(sentence, res):
    long_string(sentence)==res
   
@pytest.mark.parametrize("num1, num2, res", [
    (4,2,True),
    (3,4,False),
    (9,3,True)
])
def test_is_multiple(num1, num2, res):
    assert is_multiple(num1,num2) == res

@pytest.mark.parametrize("temp_min, temp_max, res", [
    (20,30,25),
    (10,20,15),
    (8,16,12)
])
def test_avg_temperature(temp_min, temp_max, res):
    assert avg_temperature(temp_min, temp_max) == res

@pytest.mark.parametrize("text, res", [
    ("asdfasdf", "a s d f a s d f"),
    ("Mauro Patrizio", "M a u r o   P a t r i z i o"),
    ("Hello World", "H e l l o   W o r l d")
])
def test_spacer(text,res):
    assert spacer(text) == res

@pytest.mark.parametrize("list, res", [
    ([40, 324, 543, 435], (543, 40)),
    ([165687, 3432,42,13], (165687, 13)),
    ([1, 2, 3, 4, 5, 6], (6, 1))
    
])
def test_max_min(list, res):
    assert max_min(list) == res

@pytest.mark.parametrize("radius, res", [
    (1, (3.14, 6.28)),
    (2, (12.57, 12.57)),
    (1.5, (7.07, 9.42))
])
def test_circle_area_perimeter(radius, res):
    assert circle_area_perimeter(radius) == res

@pytest.mark.parametrize("user, password, attempts, res", [
    ("usuario1", "asdasd", 3, (True,3)),
    ("usuario1", "coso", 3, (False, 4)),
    ("sdf", "asdasd", 1, (False, 2)),
    ("coso", "coso", 2, (False, 3))
])
def test_login(user, password, attempts, res):
    assert login(user, password, attempts) == res

