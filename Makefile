MAINCLASS = Log
JAVAC = javac -Xlint
CLASSES    = $(patsubst %.java, %.class, $(JAVASRC))
JARCLASSES = $(patsubst %.class, %*.class, $(CLASSES))
JARFILE = $(MAINCLASS)

all: $(JARFILE)

$(JARFILE): $(CLASSES)
	jar cvfm $(JARFILE) Manifest $(JARCLASSES)
	chmod +x $(JARFILE)

%.class: %.java
	$(JAVA) $<

clean:
	rm -f *.class $(JARFILE)