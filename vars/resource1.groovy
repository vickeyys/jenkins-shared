def call(){
    // 1. Load "bash.sh" from the shared library's resources/ directory
    def content = libraryResource "bash.sh"

    // 2. Write the content into a new file in the Jenkins workspace
    writeFile file: "script_bash.sh", text: content

    // 3. List the file to confirm it exists
    sh "ls -a script_bash.sh"

    // 4. Execute the script
    sh "bash ./script_bash.sh"
}
