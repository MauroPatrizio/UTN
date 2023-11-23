import pytest
from dna import *

@pytest.mark.parametrize("dna_matrix, res",[
    (["atgcga", "cagtgc", "ttattt", "agacgg", "gcgtca", "tcactg"], False),
    (["atgcaa", "ccgtgc", "ttatgt", "agaagg", "ccccta", "tcactg"], True),
    (["ttgcga", "cagtgc", "ttatgt", "agaagg", "acccta", "tcactg"], True),
    (["atgcta", "cagtgc", "ttatgt", "agaagg", "acccta", "tcactg"], True),
    (["ttgcga", "caggtc", "ttgtat", "agaatg", "cccgta", "tcactg"], True)
])
def test_is_mutant(dna_matrix, res):
    is_mutant(dna_matrix)==res