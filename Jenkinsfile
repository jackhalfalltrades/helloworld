node {
    // Get Artifactory server instance, defined in the Artifactory Plugin administration page.
    def server = Artifactory.server 'localhost'
    // Create an Artifactory Gradle instance.
    def rtGradle = Artifactory.newGradleBuild()
    def buildInfo

    stage('Clone sources') {
        git url: 'https://github.com/jackhalfalltrades/helloworld.git'
    }

    stage('Artifactory configuration') {
        // Tool name from Jenkins configuration
        rtGradle.tool = "grade-4.6"
        // Set Artifactory repositories for dependencies resolution and artifacts deployment.
        rtGradle.deployer repo:'gradle-release-local', server: server
        rtGradle.resolver repo:'gradle-release', server: server
    }

    stage('Gradle build') {
        buildInfo = rtGradle.run buildFile: 'build.gradle', tasks: 'build'
        rtGradle.run rootDir: "", buildFile: 'build.gradle', tasks: 'artifactoryPublish'


    }

    stage('deploy to artifact') {
        rtGradle.deployer.deployArtifacts buildInfo
    }

    stage('Publish build info') {
        server.publishBuildInfo buildInfo
    }
}

