import jenkins.model.*

def instance = Jenkins.getInstance()
def job = instance.getItem('stats_holiday')

if (job) {
    println("Triggering job: ${job.name}")
    instance.queue.schedule(job, 0)
} else {
    println("Job not found: triggeredJob")
}