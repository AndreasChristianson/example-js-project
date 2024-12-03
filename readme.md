# readme

this repo is an example of a vanilla jsp project. Adding spring and a template engine might be a next step

## bootstrapping a jsp project
- goto https://maven.apache.org/archetypes/maven-archetype-webapp/index.html and look around
- run `mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-webapp -DarchetypeVersion=1.5`
  - it will ask you for a group (the package to put stuff in, I use com.pessimistic, but anything will work), and the artifactId (the name for the project)
  - the directory made will be based on the artifact id provided
- go into the project dir: `cd example-jsp-project`, in my case
- add the following plugin to your pom file:
```
      <plugin>
              <groupId>org.apache.tomcat.maven</groupId>
              <artifactId>tomcat7-maven-plugin</artifactId>
              <version>2.2</version>
              <configuration>
                  <port>9090</port>
                  <path>/</path>
              </configuration>
      </plugin>
```
- Note that this plugin is added in the plugins section. `project`->`build`->`pluginMangement`->`plugins`
- Then run the project with maven: `mvn tomcat7:run`
  - this will build the project into a war, start tomcat, load the war, and expose localhost:9090
- Open your browser to http://localhost:9090
  - As you make changes to the project jsp files, you just have to hit refresh in the browser to pick them up
  - As you make java changes, you'll need to re-run `mvn tomcat7:run` to pick them up.
- put java files in `src/main/java/{package/as/a/path}/`. For example `src/main/java/com/pessimistic/example/jsp/project/Application.java`
  - For example, see [Application.java](https://github.com/AndreasChristianson/example-js-project/blob/e3fd22d6e24e822521e30739677c0c99dcb7bd3c/src/main/java/com/pessimistic/example/jsp/project/Application.java) 



