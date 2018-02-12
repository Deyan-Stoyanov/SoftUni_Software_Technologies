using System.Data.Entity;
using Microsoft.Owin;
using Owin;
using SoftUniBlog.Models;
using SoftUniBlog.Migrations;

[assembly: OwinStartupAttribute(typeof(SoftUniBlog.Startup))]
namespace SoftUniBlog
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            Database.SetInitializer(new MigrateDatabaseToLatestVersion<BlogDbContext, Configuration>());
            ConfigureAuth(app);
        }
    }
}
