SKRIPTE=../skripte/
skript.pdf: skript.tex
	xelatex skript.tex
	-bibtex skript
	makeindex Klassen 
	xelatex skript
	xelatex skript

skript.tex: skript.xml ${SKRIPTE}commonPrintTagsForLatex.xsl  ${SKRIPTE}lectureToLatex.xsl
	xsltproc -o skript.tex ${SKRIPTE}lectureToLatex.xsl skript.xml
