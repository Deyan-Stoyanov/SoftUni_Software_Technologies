namespace ProjectRider.Controllers
{
    using System.Collections.Generic;
    using System.Linq;
    using System.Web.Mvc;
    using Models;

    [ValidateInput(false)]
    public class ProjectController : Controller
    {
        private ProjectRiderDbContext db = new ProjectRiderDbContext();
        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            var projects = db.Projects.ToList();
            return View(projects);
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View(new Project());
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Project project)
        {
            if (this.ModelState.IsValid)
            {
                db.Projects.Add(project);
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(project);
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int id)
        {
            var project = db.Projects.Find(id);
            if (project != null)
            {
                return View(project);
            }
            return Redirect("/");
        }


        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int id, Project project)
        {
            var projectFromDb = db.Projects.Find(id);
            if (id == null)
            {
                return HttpNotFound();
            }
            if (this.ModelState.IsValid)
            {
                projectFromDb.Title = project.Title;
                projectFromDb.Description = project.Description;
                projectFromDb.Budget = project.Budget;
                db.SaveChanges();
                return Redirect("/");
            }
            return View("edit", project);
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int id)
        {
            var project = db.Projects.Find(id);
            if (project != null)
            {
                return View(project);
            }
            return Redirect("/");
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int id, Project reportModel)
        {
            var task = db.Projects.Find(id);
            if (task != null)
            {
                db.Projects.Remove(task);
                db.SaveChanges();
            }
            return Redirect("/");
        }
    }
}