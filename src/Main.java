

import org.eclipse.swt.internal.win32.OS;

import com.sun.jna.Pointer;

import cef.CefLibrary;
import cef.CefLibrary.HINSTANCE;
import cef.CefLibrary._cef_command_line_t;
import cef.CefLibrary._cef_list_value_t;
import cef.CefLibrary._cef_process_message_t;
import cef.cef_app_t;
import cef.cef_browser_process_handler_t;
import cef.cef_browser_process_handler_t.get_print_handler_callback;
import cef.cef_browser_process_handler_t.on_before_child_process_launch_callback;
import cef.cef_browser_process_handler_t.on_context_initialized_callback;
import cef.cef_browser_process_handler_t.on_render_process_thread_created_callback;
import cef.cef_browser_settings_t;
import cef.cef_browser_t;
import cef.cef_client_t;
import cef.cef_client_t.get_context_menu_handler_callback;
import cef.cef_client_t.get_dialog_handler_callback;
import cef.cef_client_t.get_display_handler_callback;
import cef.cef_client_t.get_download_handler_callback;
import cef.cef_client_t.get_drag_handler_callback;
import cef.cef_client_t.get_find_handler_callback;
import cef.cef_client_t.get_focus_handler_callback;
import cef.cef_client_t.get_geolocation_handler_callback;
import cef.cef_client_t.get_jsdialog_handler_callback;
import cef.cef_client_t.get_keyboard_handler_callback;
import cef.cef_client_t.get_life_span_handler_callback;
import cef.cef_client_t.get_load_handler_callback;
import cef.cef_client_t.get_render_handler_callback;
import cef.cef_client_t.get_request_handler_callback;
import cef.cef_client_t.on_process_message_received_callback;
import cef.cef_context_menu_handler_t;
import cef.cef_dialog_handler_t;
import cef.cef_display_handler_t;
import cef.cef_download_handler_t;
import cef.cef_drag_handler_t;
import cef.cef_find_handler_t;
import cef.cef_focus_handler_t;
import cef.cef_geolocation_handler_t;
import cef.cef_jsdialog_handler_t;
import cef.cef_keyboard_handler_t;
import cef.cef_life_span_handler_t;
import cef.cef_load_handler_t;
import cef.cef_app_t.get_browser_process_handler_callback;
import cef.cef_app_t.get_render_process_handler_callback;
import cef.cef_app_t.get_resource_bundle_handler_callback;
import cef.cef_app_t.on_before_command_line_processing_callback;
import cef.cef_app_t.on_register_custom_schemes_callback;
import cef.cef_main_args_t;
import cef.cef_print_handler_t;
import cef.cef_render_handler_t;
import cef.cef_render_process_handler_t;
import cef.cef_request_handler_t;
import cef.cef_resource_bundle_handler_t;
import cef.cef_scheme_registrar_t;
import cef.cef_settings_t;
import cef.cef_string_utf16_t;
import cef.cef_window_info_t;

public class Main
{

   private cef_client_t createClient()
   {
      cef_client_t client = ReferenceCounter.create(cef_client_t.class);
      client.get_context_menu_handler = new get_context_menu_handler_callback() {
         
         @Override
         public cef_context_menu_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - context menu");
            return null;
         }
      };
      client.get_dialog_handler = new get_dialog_handler_callback() {
         
         @Override
         public cef_dialog_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - dialog handler");
            return null;
         }
      };
      client.get_display_handler = new get_display_handler_callback() {
         
         @Override
         public cef_display_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - display handler");
            return null;
         }
      };
      client.get_download_handler = new get_download_handler_callback() {
         
         @Override
         public cef_download_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - download handler");
            return null;
         }
      };
      client.get_drag_handler = new get_drag_handler_callback() {
         
         @Override
         public cef_drag_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - drag handler");
            return null;
         }
      };
      client.get_find_handler = new get_find_handler_callback() {
         
         @Override
         public cef_find_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - find handler callback");
            return null;
         }
      };
      client.get_focus_handler = new get_focus_handler_callback() {
         
         @Override
         public cef_focus_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - fous handler");
            return null;
         }
      };
      client.get_geolocation_handler = new get_geolocation_handler_callback() {
         
         @Override
         public cef_geolocation_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - geolocation handler");
            return null;
         }
      };
      client.get_jsdialog_handler = new get_jsdialog_handler_callback() {
         
         @Override
         public cef_jsdialog_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - jsdialog handler");
            return null;
         }
      };
      client.get_keyboard_handler = new get_keyboard_handler_callback() {
         
         @Override
         public cef_keyboard_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - keyboard handler");
            return null;
         }
      };
      client.get_life_span_handler = new get_life_span_handler_callback() {
         
         @Override
         public cef_life_span_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - lifespan handler");
            return null;
         }
      };
      client.get_load_handler = new get_load_handler_callback() {
         
         @Override
         public cef_load_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - load handler");
            return null;
         }
      };
      client.get_render_handler = new get_render_handler_callback() {
         
         @Override
         public cef_render_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - render handler");
            return null;
         }
      };
      client.get_request_handler = new get_request_handler_callback() {
         
         @Override
         public cef_request_handler_t apply(cef_client_t self)
         {
            System.out.println("hi - request handler");
            return null;
         }
      };
      client.on_process_message_received = new on_process_message_received_callback() {
         
         @Override
         public int apply(cef_client_t self, cef_browser_t browser, int source_process, _cef_process_message_t message)
         {
            System.out.println("hi - process message received");
            return 0;
         }
      };
      return client;
   }
   
   private cef_browser_process_handler_t createBrowserProcessHandler()
   {
      cef_browser_process_handler_t handler = ReferenceCounter.create(cef_browser_process_handler_t.class);
      handler.on_context_initialized = new on_context_initialized_callback() {
         @Override
         public void apply(cef_browser_process_handler_t self)
         {
            // TODO: This doesn't seem to get called, so I'll have to manually create the
            // browser window elsewhere like in the C API example.
            System.out.println("hicontext never gets called");
            
            altCreateBrowser();  // Never gets called
         }
      };
      handler.on_render_process_thread_created = new on_render_process_thread_created_callback() {
         
         @Override
         public void apply(cef_browser_process_handler_t self, _cef_list_value_t extra_info)
         {
            System.out.println("hi - never called");
         }
      };
      handler.on_before_child_process_launch = new on_before_child_process_launch_callback() {
         
         @Override
         public void apply(cef_browser_process_handler_t self, _cef_command_line_t command_line)
         {
            System.out.println("hi - never called");
         }
      };
      handler.get_print_handler = new get_print_handler_callback() {
         
         @Override
         public cef_print_handler_t apply(cef_browser_process_handler_t self)
         {
            System.out.println("hi - never called");
            return null;
         }
      };
      return handler;
   }
   
   private cef_app_t createApp()
   {
      cef_app_t app = ReferenceCounter.create(cef_app_t.class);
      cef_browser_process_handler_t browserProcessHandler = createBrowserProcessHandler();
      // add in an extra reference so that it doesn't delete itself
      browserProcessHandler.base.add_ref.apply(browserProcessHandler.base);
      app.on_before_command_line_processing = new on_before_command_line_processing_callback() {
         @Override public void apply(cef_app_t self, cef_string_utf16_t process_type, _cef_command_line_t command_line)
         {
         }};
      app.on_register_custom_schemes = new on_register_custom_schemes_callback() {
         @Override public void apply(cef_app_t self, cef_scheme_registrar_t registrar)
         {
         }};
      app.get_resource_bundle_handler = new get_resource_bundle_handler_callback() {
         @Override public cef_resource_bundle_handler_t apply(cef_app_t self)
         {
            System.out.println("hi3");
            return null;
         }};      
      app.get_browser_process_handler = new get_browser_process_handler_callback() {
         
         @Override
         public cef_browser_process_handler_t apply(cef_app_t self)
         {
            System.out.println("hi4");
            browserProcessHandler.base.add_ref.apply(browserProcessHandler.base);
            return browserProcessHandler;
         }
      };
      app.get_render_process_handler = new get_render_process_handler_callback() {
         
         @Override
         public cef_render_process_handler_t apply(cef_app_t self)
         {
            System.out.println("hi5");
            return null;
         }
      };
      return app;
   }

   
   private void altCreateBrowser()
   {
      cef_window_info_t windowInfo = new cef_window_info_t();
      windowInfo.height = OS.CW_USEDEFAULT;
      windowInfo.width = OS.CW_USEDEFAULT;
      windowInfo.x = OS.CW_USEDEFAULT;
      windowInfo.y = OS.CW_USEDEFAULT;
      windowInfo.style = OS.WS_VISIBLE | OS.WS_OVERLAPPEDWINDOW | OS.WS_CLIPCHILDREN  
            | OS.WS_CLIPSIBLINGS;
      windowInfo.parent_window = null;
      cef_browser_settings_t browserSettings = new cef_browser_settings_t();
      browserSettings.size = browserSettings.size();
      cef_client_t client = createClient();

      String urlString = "http://www.google.com";
      cef_string_utf16_t url = new cef_string_utf16_t();
      cef.cef_string_utf8_to_utf16(urlString, urlString.length(), url);
      client.base.add_ref.apply(client.base);
      cef.cef_browser_host_create_browser(windowInfo, client, url, browserSettings, null);

   }
   
   CefLibrary cef;
   public void go()
   {
      // Modify #include <stdint.h> to simply be #define size_t int
      // Run JNAerator over it
      // Modify CefLibrary so that the library name is libcef not just cef
      // change List<?> to List<String> for the field order in all files
      // For Windows, the cef_sandbox_info_create() doesn't seem to be accessible from the C API, so sandboxes can't be used.

      cef = CefLibrary.INSTANCE;
      // Do a basic call to see if it works
      long val = cef.cef_now_from_system_trace_time();
      System.out.println(val);

      cef_main_args_t mainArgs = new cef_main_args_t();
      mainArgs.instance = null;  // I guess using null is fine here instead of having a real HINSTANCE 
      //mainArgs.instance = new HINSTANCE(Pointer.createConstant(OS.GetModuleHandle(null)));
      
      cef_settings_t settings = new cef_settings_t();
      settings.no_sandbox = 1;
//      settings.single_process = 0;
      settings.size = settings.size();
      
      // On not windows, this can be null, I think.
      // For Windows, the cef_sandbox_info_create() doesn't seem to be accessible from the C API, so sandboxes can't be used.
      // Pointer windows_sandbox_info = cef.cef_sandbox_info_create();
      Pointer windows_sandbox_info = null;

      cef_app_t app = createApp(); 
      app.base.add_ref.apply(app.base);
      
      app.base.add_ref.apply(app.base);
      int exit_code =  cef.cef_execute_process(mainArgs, app, windows_sandbox_info);
      if (exit_code > 0)
      {
         throw new RuntimeException("Execute Process failed");
      }
      
      app.base.add_ref.apply(app.base);
      cef.cef_initialize(mainArgs, settings, app, windows_sandbox_info);
      
      altCreateBrowser();
      cef.cef_run_message_loop();
      
      cef.cef_shutdown();

      app.base.release.apply(app.base);

//      cef.cef_sandbox_info_destroy(windows_sandbox_info);
   }
   
   public static void main(String [] args)
   {
      new Main().go();
   }
}
