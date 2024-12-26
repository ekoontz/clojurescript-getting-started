.PHONY: clean run

clean:
	-rm -rf node_modules/

node_modules: package.json
	npm install

run: node_modules
	clj -M -m cljs.main -co build.edn -v -c -r

